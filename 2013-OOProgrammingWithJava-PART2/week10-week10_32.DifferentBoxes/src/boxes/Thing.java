package boxes;

public class Thing {

    private String name;
    private int weight;

    
    

    public Thing(String name, int weight) {

        this.name = name;
        if(weight < 0){
            throw new IllegalArgumentException("Negative weight");
        } else{
            this.weight = weight;
        }
        
    }

    public Thing(String name) {
        this(name, 0);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
