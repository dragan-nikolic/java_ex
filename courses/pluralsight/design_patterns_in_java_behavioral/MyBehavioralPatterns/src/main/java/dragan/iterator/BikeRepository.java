package dragan.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int repoSize;
    private int iteratorPosition;

    public BikeRepository() {
        bikes = new String[10];
        repoSize = 0;
    }

    public void addBike(String bike) {
        if (repoSize == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[repoSize] = bike;
        repoSize++;
    }

    @Override
    public Iterator<String> iterator() {
        iteratorPosition = 0;

        Iterator<String> bikeIterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return (iteratorPosition < repoSize);
            }

            @Override
            public String next() {
                String nextBike = null;

                if (iteratorPosition < repoSize) {
                    nextBike = bikes[iteratorPosition];
                    iteratorPosition++;
                }

                return nextBike;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return bikeIterator;
    }
}
