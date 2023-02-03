  package stepdefinitions.tataskyBingeFreemium;

import app.tatasky.freemium.TataSkyFreemiumApp;
import core.ThreadLocalDriver;
import core.managers.logmanager.filemanager.JSONReader;

public class BaseStep {

    public TataSkyFreemiumApp tataSkyFreemiumApp;
    public TataSkyFreemiumApp tataSkyFreemiumAppIOS;
    JSONReader jsonReader;


    public void setupScreens() {
        if (ThreadLocalDriver.getTLDriver() != null) {
            tataSkyFreemiumApp = new TataSkyFreemiumApp(ThreadLocalDriver.getTLDriver());
        }
        if (ThreadLocalDriver.getTLIOSDriver() != null) {
            tataSkyFreemiumApp = new TataSkyFreemiumApp(ThreadLocalDriver.getTLIOSDriver());
        }

    }


}
