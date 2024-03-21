
    public class Test {
        private static int proximoId = 1;
        private int id;
        
        public Test() {
            this.id = proximoId++;
        }
        
        public int getId() {
            return id;
        }
        
        public static void main(String[] args) {
            Test obj1 = new Test();
            Test obj2 = new Test();
            Test obj3 = new Test();
            
            System.out.println("ID do obj1: " + obj1.getId());
            System.out.println("ID do obj2: " + obj2.getId());
            System.out.println("ID do obj3: " + obj3.getId());
        }
    }
    

