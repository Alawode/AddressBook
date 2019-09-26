import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}

	public ArrayList<BuddyInfo> getBuddyInfo() {
		return buddyInfo;
	}

	public void setBuddyInfo(ArrayList<BuddyInfo> buddyInfo) {
		this.buddyInfo = buddyInfo;
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		this.buddyInfo.add(buddyInfo);
	}
	
	public void removeBuddy(BuddyInfo buddyInfo) {
		this.buddyInfo.remove(buddyInfo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Address Book");
		
		// Another print statement to test git history
		System.out.print("Testing 123");
		
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "1223");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
		// test comment 
		

	}

}
