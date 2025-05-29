import { AccordionItem } from '@carbon/react';
import React, { useImperativeHandle, useState } from 'react';
import ScrollableCardContainer from './scrollable-card-container';
import { HttpPool } from '../../http';
import { get } from 'axios';

const AccordionConsumer = ({ title, host, port, ref }) => {

  const imageUrl = 'https://my-cobra.s3.ap-southeast-1.amazonaws.com/posters/v1-poster.png';
  let sample = [
    { id: 1, name: 'test 1', imageUrl: imageUrl },
    { id: 2, name: 'test 1', imageUrl: imageUrl },
    { id: 3, name: 'test 1', imageUrl: imageUrl },
    { id: 4, name: 'test 1', imageUrl: imageUrl },
    { id: 5, name: 'test 1', imageUrl: imageUrl },
    { id: 6, name: 'test 1', imageUrl: imageUrl },
    { id: 7, name: 'test 1', imageUrl: imageUrl },
    { id: 8, name: 'test 1', imageUrl: imageUrl },
    { id: 9, name: 'test 1', imageUrl: imageUrl },
    { id: 10, name: 'test 1', imageUrl: imageUrl },
    { id: 11, name: 'test 1', imageUrl: imageUrl }
  ];

  const [movieData, setMovieData] = useState([]);
  const [version, setVersion] = useState(0);

  const buildTitle = () => `${host}:${port}  [version: ${version}]`;

  useImperativeHandle(ref, () => ({
    triggerAction: reFetch
  }));

  const reFetch = () => {
    const client = HttpPool.obtain(`${host}:${port}`);
    const data = []
    let promises = [];
    for (let i = 0; i < 20; i++) {
      promises.push( client.get(`/api/movie/${i}`).then((result) => {
        if (result === null || result.data === null || result.data === "" || result.error) {
          return;
        }
        data.push(result.data)
      }))
    }

    let getVersion;
    promises.push(client.get('/api/movie/version').then((result) => {
      getVersion = result.data;
    }))

    Promise.all(promises).then(() => {
      setMovieData(data);
      setVersion(getVersion);
    })
  };

  return (
    <>
      <AccordionItem key={host} disabled={false} title={buildTitle()}>
        <ScrollableCardContainer data={movieData} />
      </AccordionItem>
    </>
  );
};

export default AccordionConsumer;
