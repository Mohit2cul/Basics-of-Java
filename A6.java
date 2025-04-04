class A6{
    public static void main(String[] args) {
        float x = 1.00f;
        double y;
        y = x;//sahi h kyuki y double h aur x float h
        //x = y;//glt h kyuki y double h aur x float h
        x = (float) y;// ye method sahi h kyuki isme humne typecast kr dia double ko float m 
        System.out.println(x);
        System.out.println(y);
    }
}