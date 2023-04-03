public class task_3_hw_4 {
    public static void main(String[] args) {
        
        int number_1 = input_class.Int("Число 1: ");
        String sign = input_class.Str("Знак: ");
        int number_2 = input_class.Int("Число 2: ");
        int last_result = number_1;
        String text = "";
        while(1>0)
        {
            last_result = number_1;
            number_1 = check_result(number_1, sign, number_2);
            System.out.println(number_1);
            text = input_class.Str("Знак: ");
            if (text.equals("!stop"))
            {
                break;
            }
            if (text.equals("Отмена"))
            {
                number_1 = last_result;
                System.out.println(number_1);
                sign = input_class.Str("Знак: ");
                number_2 = input_class.Int("Число 2: ");
            }
            else 
            {
                sign = text;
                number_2 = input_class.Int("Число 2: ");
            }
        }
    }

    public static int check_result (int number_1, String sign, int number_2)
    {
        int result_1=0;
        if(sign.equals("+"))
        {
            result_1 = number_1+number_2;
        }

        if(sign.equals("-"))
        {
            result_1 = number_1-number_2;
        }

        if(sign.equals("*"))
        {
            result_1 =  number_1*number_2;
        }

        if(sign.equals("/"))
        {
            result_1 =  number_1/number_2;
        }

        return result_1;
    }

}
