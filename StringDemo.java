class StringDemo {
    public static void main(String[] args) {

        // STRING (Immutable)
        String s = "Hello";
        s.concat(" World");

        System.out.println("Using String:");
        System.out.println("After concat: " + s); 
        // No change because String is immutable

        //  STRING BUILDER (Mutable) 
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("\nUsing StringBuilder:");
        System.out.println("After append: " + sb);

        //  STRING BUFFER (Mutable & Thread Safe) 
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");

        System.out.println("\nUsing StringBuffer:");
        System.out.println("After append: " + sbf);

        
    }
}

