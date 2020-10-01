package frc.robot.FRCLib;

/**
 * This is an enhanced version of an enum.
 * 
 * It offers a couple of benefits, mainly due to being a class:
 * 
 * 1) It can have child methods
 * 2) It is abstractable
 * 3) Names can be more complex due to being strings
 * 
 */
public class EnhancedEnum{
    /**
     * The entries in the EnhancedEnum
     */
    private String[] entries;

    /**
     * Create a new EnhancedEnum with a set of entries
     * @param entries
     */
    public EnhancedEnum(String[] entries){
        this.entries = entries;
    }

    /**
     * Insert a new enum entry to the end
     * 
     * Will automatically assign an ID
     * @param entry
     */
    public void insertEntry(String entry){
        int i; 
  
        // create a new array of size n+1 
        String newarr[] = new String[n + 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        this.entries = newarr;
    }

    /**
     * Gets the enum text value at the given index
     * @param index
     * @return enum title
     */
    public String getAtIndex(int index){
        if(this.entries.length >= index){
            return null;
        }
        return this.entries[index];
    }

    /**
     * Gets the int value for a given string
     * 
     * This is the most in line with traditional Enums in Java
     * @param search
     * @return
     */
    public int getIndex(String search){
        for(int i = 0; i < this.entries.length; i++){
            if(this.entries[i] == search){
                return i;
            }
        }
        return -1;
    }

    /**
     * Gets all entries in the enum
     * 
     * This may be helpful for applying math or intense computing to Enum values
     * @return
     */
    public String[] getAllEntries(){
        return this.entries;
    }
}