import React, { useRef } from 'react';
import { Accordion, Button, ButtonSet } from '@carbon/react';
import { AccordionConsumer, ContentHeading } from '../../components';
import './style.scss';
import { useConsumerStore } from '../../store/use-consumer-store';

const ConsumerTracking = () => {
  const { consumers } = useConsumerStore();
  const childRefs = useRef([]);

  const onReloadConsumer = () => {
    childRefs.current.forEach((ref) => ref?.triggerAction());
  };

  return (
    <>
      <ContentHeading displayName={'Consumers'} />

      <ButtonSet className={'cds--btn-controlled-set'}>
        <Button className={'accordion-btn'} onClick={onReloadConsumer}>
          Reload
        </Button>
      </ButtonSet>
      <Accordion align={'start'} disabled={false} isFlush={false} ordered={false} size={'lg'}>
        {consumers &&
          consumers.map((track, index) => (
            <AccordionConsumer title={track.domain} key={track.domain} host={track.domain} port={track.port}
            ref={(el) => (childRefs.current[index] = el)}/>
          ))}
      </Accordion>
    </>
  );
};

export default ConsumerTracking;
