public class challenge2 {
    String compute(int number) {

        String out = new String();

        if(number % 3 == 0)
            out += "Foo";
        else if(number % 5 == 0)
            out += "Bar";
        else if(number % 7 == 0)
            out += "Qix";

        String numberString = String.valueOf(number);

        for(int i = 0; i < numberString.length(); i++) {

            if (numberString.charAt(i) == '3')
                out += "Foo";
            else if (numberString.charAt(i) == '5')
                out += "Bar";
            else if (numberString.charAt(i) == '7')
                out += "Qix";
        }

        if ( !out.isEmpty() ) {
            return out;
        }

        out += number;
        return out;
    }

    String compute2 (int number) {

        String out = new String();

        if(number % 3 == 0)
            out += "Foo";

        if(number % 5 == 0)
            out += "Bar";

        if(number % 7 == 0)
            out += "Qix";

        String numberString = String.valueOf(number);

        for(int i = 0; i < numberString.length(); i++) {

            if (numberString.charAt(i) == '3')
                out += "Foo";

            if (numberString.charAt(i) == '5')
                out += "Bar";

            if (numberString.charAt(i) == '7')
                out += "Qix";

            if ((out.contains("Foo") || out.contains("Bar") || out.contains("Qix")) == false)
                if(numberString.charAt(i) != '0')
                    out += numberString.charAt(i);

            if (numberString.charAt(i) == '0')
                out += '*';
        }
        return out;
    }
}
