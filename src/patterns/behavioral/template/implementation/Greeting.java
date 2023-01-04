package patterns.behavioral.template.implementation;

/*
 * The template method.
 */
public abstract class Greeting {

    /*
     * The main algorithm
     */
    public void greet(String context) {
        System.out.println(getStart(context) + who() + "!");
    }

    /*
     * Part of the algorithm implemented already.
     */
    private String getStart(String context) {
        if (context.equals("formal")) {
           return "Good afternoon "; 
        } else {
           return "Hello ";
        }
    }

    /*
     * Part of the algorithm that needs to be implemented.
     */
    protected abstract String who();
}
