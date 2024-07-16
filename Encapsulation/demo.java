

class demo {
    public static void main(String[] args) 
    {
            A obj = new A();
            System.out.println("age " + obj.getAge()+ " Name " +obj.getName() );
    }
}

class A {

        private String name="Abhi";
        private int age=24;
  
        public int getAge()
        {
            return age ;
            
        }
        public String getName()
        {
            return name;
        }
}



