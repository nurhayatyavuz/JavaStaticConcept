public class javaStaticConcept {


        public static void main(String[] args){
            Person p1=new Person();
            p1.setName("melisa");
            p1.setWage(4500);

            Person p2=new Person();
            p2.setName("ali");
            p2.setWage(4500);

            Person p3=new Person();
            p3.setName("fatma");
            p3.setWage(4500);

            p3.information();

        }

    }
    class Person{
        private String name;
        private int wage;
        private  static int createdpersaonobject;
        public Person(){
            createdpersaonobject++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            name = name;
        }

        public int getWage() {
            return wage;
        }

        public void setWage(int wage) {
            if(wage<0){
                wage=0;
            }
            else {
                this.wage= wage;
            }

        }
        public void information(){
            System.out.println("created object person: "+createdpersaonobject);
        }
    }


