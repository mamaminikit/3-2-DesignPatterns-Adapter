/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class StockMarketAdapter implements CSVParser {
    private StockMarketDataParser marketDataParser;

    public StockMarketAdapter(StockMarketDataParser marketDataParser) {
        this.marketDataParser = marketDataParser;
    }

    @Override
    public void parseCSV() {
        marketDataParser.parseFromCSV();
    }
}