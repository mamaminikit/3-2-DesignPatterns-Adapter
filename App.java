/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class App {
	public static void main(String[] args) {
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockMarketData = new StockMarketAdapter(new StockMarketDataParser());

		parse(realEstate);
		parse(machineLearning);
		parse(stockMarketData);
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
