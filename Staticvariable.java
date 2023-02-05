public class Staticvariable {
    private static String str = "This is static class variable program";
        static class MyNestedClass{
            public void disp() {
                System.out.println(str);
            }
        }
        public static void main(String args[])
        {
            Staticvariable.MyNestedClass obj = new Staticvariable.MyNestedClass();
            obj.disp();
        }
    }

