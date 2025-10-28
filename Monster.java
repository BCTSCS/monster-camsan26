public class Monster {
    private int arms, eyes, buttons;
    private String name;
    public Monster() {
        this.arms = 2;
        this.eyes = 2;
        this.buttons = 1;
        this.name = "Danny";
    }
    public Monster (int arms, int eyes, int buttons, String name) {
        this.arms = arms;
        this.eyes = eyes;
        this.buttons = buttons;
        this.name = name;
    }
    public void setArms(int a) {
        this.arms = a;
    }
    public void setEyes(int e) {
        this.eyes = e;
    }
    public void setButtons(int b) {
        this.buttons = b;
    }
    public void setName(String n) {
        this.name = n;
    }
    public int getArms() {
        return arms;
    }
    public int getEyes() {
        return eyes;=
    }
    public int getButtons() {
        return buttons;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "arms: "+ arms + "," + " eyes: " + eyes + "," + " name: " + name + "," + " buttons: " + buttons;
    }
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster(4, 2, 3, "Spooky");
        System.out.println(m1);
        System.out.println(m2);
    }
}