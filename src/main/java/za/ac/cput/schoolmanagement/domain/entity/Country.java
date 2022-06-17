package za.ac.cput.schoolmanagement.domain.entity;

public class Country {

    private final String id;
    private final String name;

    private Country(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String id, name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build(){
            return new Country(this);
        }
    }

//    @Override
//    public int hashCode(){return  Objects.hash(name);}

    @Override
    public String toString(){
        return "County{" +
                "id= '" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
