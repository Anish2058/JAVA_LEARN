import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<HTTPMethodConvertible> inherit = new ArrayList<>();
        inherit.add(LibraryEnum.FIRST);
        inherit.add(ClientEnum.google);
        for (HTTPMethodConvertible element:inherit){
            System.out.println(element.getHTTPMethodType());
        }
    }

    static interface HTTPMethodConvertible{
        public String getHTTPMethodType();
    }

    static enum LibraryEnum implements HTTPMethodConvertible{
        FIRST("Google Pixel"),SECOND("Huawei"), THIRD("Apple 11 Pro");
        String httpMethodType;

        LibraryEnum(String phone){
            httpMethodType=phone;
        }

        @Override
        public String getHTTPMethodType() {
            return httpMethodType;
        }
    }

    static enum ClientEnum implements HTTPMethodConvertible{
        huawei("Hongling os"),apple("ios"),google("Android One");
        String httpMethodType;

        ClientEnum(String s){
            httpMethodType =s;
        }

        @Override
        public String getHTTPMethodType() {
            return httpMethodType;
        }
    }

}
