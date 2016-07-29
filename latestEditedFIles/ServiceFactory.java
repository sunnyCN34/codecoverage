package codecoverage;

public class ServiceFactory{
	public static FileInfoService getFileInfoService(){
		return new FileInfoService();
	}
}
