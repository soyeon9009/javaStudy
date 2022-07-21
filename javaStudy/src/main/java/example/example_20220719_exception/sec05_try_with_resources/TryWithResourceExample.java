package example.example_20220719_exception.sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
//			fis.close(); //// 꼭 닫아줘야함.
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다");
		}
	}
}
