package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class TrainDetails {
	
	    @Id
		private String trainId;
		private String departure;
		private String destination;
		private int price;
		private String date;
		public TrainDetails(String trainId, String departure, String destination, int price, String date) {
			super();
			this.trainId = trainId;
			this.departure = departure;
			this.destination = destination;
			this.price = price;
			this.date= date;
		}
		
		
		public String gettrainId() {
			return trainId;
		}
		public String getDeparture() {
			return departure;
		}
		public String getDestination() {
			return destination;
		}
		public int getPrice() {
			return price;
		}
		public String getDate() {
			return date;
		}


		@Override
		public String toString() {
			return "TrainDetails [trainId=" + trainId + ", departure=" + departure + ", destination=" + destination
					+ ", price=" + price + ", date=" + date + "]";
		}
		
		
}

