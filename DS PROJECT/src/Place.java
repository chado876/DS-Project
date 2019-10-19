
public class Place {
		 int id,pcode;
		String name,description,address,photolink,mainattr,openhours,contactnum;
		int cost;
		
		public Place() {
			super();
			this.id = id;
			this.openhours = openhours;
			this.contactnum = contactnum;
			this.name = name;
			this.description = description;
			this.address = address;
			this.pcode = pcode;
			this.photolink = photolink;
			this.mainattr = mainattr;
			this.cost = cost;
		}
		
		public Place(int id, String openhours, String contactnum, String name, String description, String address,
				int pcode, String photolink, String mainattr, int cost) {
			super();
			this.id = id;
			this.openhours = openhours;
			this.contactnum = contactnum;
			this.name = name;
			this.description = description;
			this.address = address;
			this.pcode = pcode;
			this.photolink = photolink;
			this.mainattr = mainattr;
			this.cost = cost;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getOpenhours() {
			return openhours;
		}
		public void setOpenhours(String openhours) {
			this.openhours = openhours;
		}
		public String getContactnum() {
			return contactnum;
		}
		public void setContactnum(String contactnum) {
			this.contactnum = contactnum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPcode() {
			return pcode;
		}
		public void setPcode(int pcode) {
			this.pcode = pcode;
		}
		public String getPhotolink() {
			return photolink;
		}
		public void setPhotolink(String photolink) {
			this.photolink = photolink;
		}
		public String getMainattr() {
			return mainattr;
		}
		public void setMainattr(String mainattr) {
			this.mainattr = mainattr;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Place [id=" + id + ", openhours=" + openhours + ", contactnum=" + contactnum + ", name=" + name
					+ ", description=" + description + ", address=" + address + ", pcode=" + pcode + ", photolink="
					+ photolink + ", mainattr=" + mainattr + ", cost=" + cost + "]";
		}
		
		public void Display() {
			System.out.println(toString());
		}
		
}