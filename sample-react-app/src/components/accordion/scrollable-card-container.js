import { Column, Grid } from '@carbon/react';
import CardItem from './card-item';

const ScrollableCardContainer = ({ data }) => {
  return (
    <Grid fullWidth as={'div'} className={'accordion--grid-container'}>
      <>
        {data.map((item) => (
          <Column key={item.id} span={4} style={{ marginBottom: '1rem' }}>
            <CardItem id={item.id} displayName={item.title} imageUrl={item.imageUrl} />
          </Column>
        ))}
      </>
    </Grid>
  );
};

export default ScrollableCardContainer;
