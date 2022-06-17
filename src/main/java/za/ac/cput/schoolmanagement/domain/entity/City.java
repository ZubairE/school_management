package za.ac.cput.schoolmanagement.domain.entity;

public class City {
    private final String id;
    private final String name;

    private City(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;}

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public static class Builder {
            private String id, name;

            public City.Builder id(String id) {
                this.id = id;
                return this;
            }

            public City.Builder name(String name) {
                this.name = name;
                return this;
            }

            public City.Builder copy(City city){
                this.id = city.id;
                this.name = city.name;
                return this;
            }

            public City build(){
                return new City(this);
            }
        }

//    @Override
//    public int hashCode(){return  Objects.hash(name);}

        @Override
        public String toString(){
            return "City{" +
                    "id= '" + id + '\'' +
                    ", name=" + name + '\'' +
                    '}';
        }
    }