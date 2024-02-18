public class method {
    public static void main(String[] args) {
        String line = "  Тест Произвольной Строки  ";

        System.out.println("Вывод исходной строки:" + line);

        System.out.println("Вывод строки с методом trim:" + line.trim());

        System.out.println("Вывод строки с методом toUpperCase:" + line.toUpperCase());

        System.out.println("Вывод строки с методом toLowerCase:" + line.toLowerCase());

        System.out.println("Вывод строки с методом startsWith:" + line.startsWith("  ") + " и " + line.startsWith("Тест"));

        System.out.println("Вывод строки с методом length:" + line.length());

        System.out.println("Вывод строки с методом contains:" + line.contains("Строки"));

        System.out.println("Вывод строки с методом isEmpty:" + line.isEmpty());

        System.out.println("Вывод строки с методом substring 1:" + line.substring(7));

        System.out.println("Вывод строки с методом substring 2:" + line.substring(7,19));

        System.out.println("Вывод строки с методом charAt:" + line.charAt(7));

        System.out.println("Вывод строки с методом concat:" + line.concat("и получение результата"));

        System.out.println("Вывод строки с методом indexOf:" + line.indexOf("Т"));

        System.out.println("Вывод строки с методом lastIndexOf:" + line.lastIndexOf("т"));

        String line2 = "  Тест Произвольной Строки.  ";
        System.out.println("Вывод строки с методом equals:" + line.equals(line2));

        System.out.println("Вывод строки с методом equalsIgnoreCase:" + line.equalsIgnoreCase(line.toUpperCase()));

        System.out.println("Вывод строки с методом replace:" + line.replace("о","ооо"));

        String[] words = line.split(" ");
        System.out.println("Вывод строки с методом split:");
        for(String word : words){
        System.out.println(word);
        }
    }
}
