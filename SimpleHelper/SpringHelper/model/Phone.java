package study.spring.springhelper.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

public class Phone {
	@SerializedName("rt") private String rt;
	@SerializedName("rtmsg") private String rtmsg;
	@SerializedName("item") private Item item;
	
	@Data
	public class Item{
		@SerializedName("name") private String name;
		@SerializedName("type") private String type;
		@SerializedName("img") private String img;
		@SerializedName("price") private Price price;
		
		public class Price{
			@SerializedName("fixed") private int fixed;
			@SerializedName("sale") private int sale;
		}
	
	
	}
	
	

}
