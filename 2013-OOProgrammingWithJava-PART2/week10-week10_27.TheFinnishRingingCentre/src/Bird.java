
public class Bird implements Comparable<Bird>{

    private String name;
    private String latinName;
    private int ringingYear;
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bird other = (Bird) obj;
        if ((this.latinName == null) ? (other.latinName != null) : !this.latinName.equals(other.latinName)) {
            return false;
        }
        if (this.ringingYear != other.ringingYear) {
            return false;
        }
        return true;
    }

    

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 37 * hash + this.ringingYear;
        return hash;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    

    @Override
    public int compareTo(Bird other) {
        return this.getLatinName().compareTo(other.getLatinName());
    }
    
    
}


