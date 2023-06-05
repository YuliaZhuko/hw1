package tools;

public class NumberTools {
    public static Integer convertStrToInt(String str){
      try {
          Integer variableInt = Integer.parseInt(str);
          if (variableInt < 0) {
              return null;
      }
              return variableInt;
      } catch (NumberFormatException ignore) {
          return null;

      }
    }
}
