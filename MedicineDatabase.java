import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MedicineDatabase {

    private ArrayList<indiaMedicine> medicineList;
    private String dataFileName;

    /** Database constructor.  Accomplish the following:
     * Initialize the instance variable stations to an empty list
     * Use createListOfStringsFromFile helper method to read file data into collection of strings
     * Process each string using split/splitOnNonQuotedCommas to generate a data array
     * Process the necessary data and pass to the Station constructor
     * Add the newly created station to the list 'stations'
     *
     * @param dataFileName
     */
    public MedicineDatabase(String dataFileName) {
        this.dataFileName = dataFileName;
        medicineList = new ArrayList<indiaMedicine>();
        ArrayList<String> data = createListOfStringsFromFile(dataFileName);
        String [] info= null;
        for(int x= 1; x<data.size();x++){
        String s= data.get(x);
        info=s.split(",");
        String medname= info[0];
        double rupeeprice= Double.parseDouble(info[1]);
        boolean isdiscontinued= Boolean.parseBoolean(info[2]);
        String manname = info[3];
        String packsize=info[4];
        String[] bothcomps= {info[5],info[6]};
        String comp1=info[5];
        String comp2=info[6];
            
        indiaMedicine stat = new indiaMedicine(medname, bothcomps, manname, isdiscontinued, rupeeprice, packsize );
        medicineList.add(stat);
          }

    }

    
    /**
     * Transforms the contents of a text file into an arraylist of strings.  Each string represents the
     * contents of a single line from the file (ie. all text up to the newline \n terminator.)
     *
     * @param fileName the file to read from
     * @return the resulting arraylist; null, if encounter errors
     */
    private ArrayList<String> createListOfStringsFromFile(String fileName) {
        ArrayList<String> data = null;
        try {
            data = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("The file " + fileName + " could not be opened.");
            e.printStackTrace();
        }
        return data;
    }

    /**
     * Splits a string on commas but keeps intact any commas occurring within quotes.
     * Ex. "1, 2, 3, "4, 5, 6", 7, 8" (contains commas inside quotes)
     * Splits into ["1", "2", "3", "4, 5, 6", "7", "8"] (does not split at quoted commas)
     *
     * @return an array of strings where quoted commas are retained intact
     */
    private String[] splitOnNonQuotedCommas(String hasCommasWithinQuotes) {
        return hasCommasWithinQuotes.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
    }

    @Override
    public String toString() {
        return "A database built from the file " + dataFileName;
    }

}
