package ledotest.ledo1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String diffLine = "Only in /export/jenkins/workspace/ci-manager-web_test/target/ci_manager/WEB-INF/classes/com/ledo/platform/manager/utils: LdapMd5.class";
       if(diffLine.contains("Only in " + "/export/jenkins/workspace/ci-manager-web_test/target/ci_manager")){
           //找到新增加的文件，提取路径
    	   String aaa = diffLine.substring(8,diffLine.indexOf(":"));
           String filePath = diffLine.substring(diffLine.indexOf(":")+1).trim();
           System.out.println(aaa + " "  + filePath);
       }
    }
    
    
}
