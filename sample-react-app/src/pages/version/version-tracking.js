import React from 'react';
import { ContentHeading } from '../../components';
import { Button } from '@carbon/react';
import { Text } from '@carbon/react/lib/components/Text';
import { useProducerStore } from '../../store/use-producer-store';
import HttpPool from '../../http/http-pool';

function VersionTracking() {
  const { producerNode } = useProducerStore();

  const [version, setVersion] = useProducerStore();

  const handleGetVersion = (e) => {
    HttpPool.obtain(`${producerNode.domain}:${producerNode.port}`)
      .get('/api/movie/version')
      .then((result) => {
        setVersion(result);
      });
  };

  return (
    <>
      <ContentHeading displayName={'Version Tracking'} />
      <div
        style={{
          width: '300px',
          display: 'flex',
          justifyContent: 'space-between',
          alignItems: 'start',
          flexDirection: 'column'
        }}>
        <div
          style={{
            padding: '1rem 0'
          }}>
          <Text>Version: {version}</Text>
        </div>
        <Button kind={'primary'} onClick={handleGetVersion}>
          Get
        </Button>
      </div>
    </>
  );
}

export default VersionTracking;
