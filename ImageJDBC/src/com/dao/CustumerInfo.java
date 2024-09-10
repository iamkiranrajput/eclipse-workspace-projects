package com.dao;


public class CustumerInfo {
		int id;
		String name;
		String pic;
		
		public CustumerInfo(int id, String name, String pic2) {
			
			this.id=id;
			this.name=name;
			this.pic=pic2;
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPic() {
			return pic;
		}
		public void setPic(String pic) {
			this.pic = pic;
		}
		
	}

