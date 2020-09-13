package com.rz.junit.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class JUnit4TemporaryFolderRuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testCreatingTemporaryFileFolder() throws IOException {
        File file = temporaryFolder.newFile("testFile");
        File folder = temporaryFolder.newFolder("testFolder");

        String filePath = file.getAbsolutePath();
        String folderPath = folder.getAbsolutePath();

        File testFile = new File(filePath);
        File testFolder = new File(folderPath);

        assertTrue(testFile.exists());
        assertTrue(testFile.isFile());
        assertTrue(testFolder.exists());
        assertTrue(testFolder.isDirectory());
    }
}
