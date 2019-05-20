
import okhttp3.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.*;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws IOException{
        File excelFile = new File("C:\\Users\\geatalay\\Desktop\\Kayseri_Haftasonu.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);

        Iterator<Row> rowItr = sheet.iterator();
        rowItr.next();

        File file = new File("C:\\Users\\geatalay\\Desktop\\file.txt");
        FileOutputStream fos = new FileOutputStream(file);
        PrintWriter px = new PrintWriter(fos);

        while(rowItr.hasNext()){
            Row row = rowItr.next();

            //iterates on cells for the current row
            Iterator<Cell> cellItr = row.cellIterator();

                while(cellItr.hasNext()){
                    Cell cell1 = cellItr.next();
                    String vkn = cell1.getStringCellValue();
                    Cell cell2 = cellItr.next();
                    String plakaKodu = cell2.getStringCellValue();
                    System.out.print(cell1.toString()+"\t");
                    System.out.println(cell2.toString());

                    OkHttpClient client = new OkHttpClient();

                    MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");
                    RequestBody body = RequestBody.create(mediaType, "cmd=vergiNoIslemleri_vergiNumarasiSorgulama&callid=a190e5646abc6-12&pageName=R_INTVRG_INTVD_VERGINO_DOGRULAMA&token=d1078f5e3dc646b78d5d4e5842f21e97feb48d366bc7617458b6679dec12675154a01fccc42292bb04d926bc259dbc75e39dd8e202535fd70a7098396c74a6f7&jp=%7B%22dogrulama%22%3A%7B%22vkn1%22%3A%22"+vkn+"%22%2C%22tckn1%22%3A%22%22%2C%22iller%22%3A%220"+plakaKodu+"%22%2C%22vergidaireleri%22%3A%22038254%22%7D%2C%22dyntab2%22%3A%7B%22tckn%22%3A%22%22%2C%22vkn%22%3A%229600528023%22%2C%22unvan%22%3A%22%C3%9CM%C3%9CT%20YILDIRIM%20VE%20ORT%22%2C%22vergidairesi%22%3A%22GEVHER%20NES%C4%B0BE%20VERG%C4%B0%20DA%C4%B0RES%C4%B0%22%2C%22faaliyetdurum%22%3A%22FAAL%22%7D%2C%22dyntab3%22%3A%7B%22tckn%22%3A%22%22%2C%22vkn%22%3A%229600528023%22%2C%22unvan%22%3A%22%C3%9CM%C3%9CT%20YILDIRIM%20VE%20ORT%22%2C%22vergidairesi%22%3A%22GEVHER%20NES%C4%B0BE%20VERG%C4%B0%20DA%C4%B0RES%C4%B0%22%2C%22faaliyetdurum%22%3A%22FAAL%22%7D%7D");
                    Request request = new Request.Builder()
                            .url("https://ivd.gib.gov.tr/tvd_server/dispatch")
                            .post(body)
                            .addHeader("Origin", "https://ivd.gib.gov.tr")
                            .addHeader("Accept-Encoding", "gzip, deflate, br")
                            .addHeader("Accept-Language", "tr-TR,tr;q=0.9,en-US;q=0.8,en;q=0.7")
                            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36")
                            .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                            .addHeader("Accept", "application/json, text/javascript, */*; q=0.01")
                            .addHeader("Referer", "https://ivd.gib.gov.tr/tvd_side/main.jsp?token=d1078f5e3dc646b78d5d4e5842f21e97feb48d366bc7617458b6679dec12675154a01fccc42292bb04d926bc259dbc75e39dd8e202535fd70a7098396c74a6f7")
                            .addHeader("Cookie", "JSESSIONID=B6C3A50E352FE7690C9EEA5FA786DAF4")
                            .addHeader("Connection", "keep-alive")
                            .addHeader("Cache-Control", "no-cache")
                            .addHeader("Postman-Token", "fb29f545-5268-418d-8e9f-c46e0f77c4f1,1c201c8d-6909-4bce-b03c-b44f20956e51")
                            .addHeader("Host", "ivd.gib.gov.tr")
                            .addHeader("content-length", "898")
                            .addHeader("cache-control", "no-cache")
                            .build();





                }
        }




    }

}
