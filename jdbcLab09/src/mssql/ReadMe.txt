請替jdbcLab09中的lab09.SystemUtils.java類別編寫下列方法：

1. public static Blob fileToBlob(InputStream is) 
	. 將參數is內的非文字資料全部讀出，存入一個位元組陣列，然後再由此位元組陣列建立一個
	  Blob物件並傳回此Blob物件。
   	. javax.sql.rowset.serial.SerialBlob為實作java.sql.Blob介面的類別，其建構子如下： 
   	      SerialBlob(byte[] b)
   	      
2. public static Blob fileToBlob(String filePath) 
   	. 將參數filePath代表的檔案以非文字模式全部讀出，存入一個位元組陣列，然後再由
   	  此位元組陣列建立一個Blob物件並傳回此Blob物件。
   	
	
3. public static Clob fileToClob(String textFileName) 	      	
	. 將參數textFileName代表的檔案以文字模式全部讀出，存入一個字元陣列，然後再由
	  此字元陣列建立一個Clob物件。
	. javax.sql.rowset.serial.SerialClob為實作java.sql.Clob介面的類別，其建構子如下： 
   	      SerialClob(char[] ch)         

4. public static Clob fileToClob(String textFileName, String encoding) 
   	. 將參數textFileName代表的檔案以文字模式，且編碼為參數encoding全部讀出，存入一個
   	  字元陣列內，然後再由此字元陣列建立一個Clob物件。
   	  
5. public char[] clobToCharArray(Clob clob) 	  
	. 將參數clob轉換為字元陣列並傳回此字元陣列。
	
6. public byte[] blobToByteArray(Blob blob) 	  
	. 將參數blob轉換為位元組陣列並傳回此位元組陣列。	
	   	  
7. public static void blobToFile(Blob blob, File file) {   	   
	. 取出參數Blob物件內的位元組陣列存入參數file物件所指定的檔案內
	
8. public static void clobToFile(Clob clob, File file) {   	   
	. 取出參數Clob物件內的字元陣列存入參數file物件所指定的檔案內	


