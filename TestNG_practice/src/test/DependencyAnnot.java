package test;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnot extends Annot2{
	
	@Test
	public void openingBrowser() throws IOException
	{
		Login();
		System.out.println("executing opening Browser");
	}

}
