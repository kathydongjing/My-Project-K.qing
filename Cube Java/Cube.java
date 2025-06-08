public class Cube {
//the name of class must match the name of file 
    
    //variables
    private int height;
    private int width; 
    private int length; 

    //constructors
    public Cube(int side) {
        height = side;
        width = side;
        length = side;  
            //side must be written after height, width, and length or else it results in a calculated value of zero (default) 
                //bc computer reads code sequentially 
    }

    //methods (eg. constructing a hammer which can be reused instead of constructing a new one in main each time)
    public void findVolume() {
        //need to use void so that the "find volume" itself doesnt return the data. Only returned in Main.java
        System.out.println(height*width*length);
    }
}


//a class (Cube is a class) is a blueprint for creating objects in java
//class defines object behaviour (reusable)
//main runs the program 


