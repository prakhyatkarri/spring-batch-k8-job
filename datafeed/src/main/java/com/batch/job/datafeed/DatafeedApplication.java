//package com.batch.job.datafeed;
//
//import com.batch.job.datafeed.config.TaskConfiguration;
//import com.batch.job.datafeed.model.CurrencyRate;
//import com.batch.job.datafeed.repository.CurrencyRateRepository;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.task.configuration.EnableTask;
//import org.springframework.cloud.task.configuration.TaskConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
//
//import javax.sql.DataSource;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@SpringBootApplication
//@EnableTask
////@EnableBatchProcessing
//public class DatafeedApplication {
//	private final OkHttpClient okHttpClient;
//	private final Environment environment;
//	private final CurrencyRateRepository currencyRateRepository;
//	private static final Logger LOGGER = LoggerFactory.getLogger(DatafeedApplication.class.getName());
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Value("${API_URL}")
//	private String URL;
//
//	public DatafeedApplication(OkHttpClient okHttpClient, Environment environment, CurrencyRateRepository currencyRateRepository) {
//		this.okHttpClient = okHttpClient;
//		this.environment = environment;
//		this.currencyRateRepository = currencyRateRepository;
//	}
//
//	@Bean
//	public TaskConfiguration getTaskConfigurer() {
//		return new TaskConfiguration(dataSource);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(DatafeedApplication.class, args);
//	}
//	@Bean
//	public ApplicationRunner applicationRunner() {
//		return (ApplicationArguments args) -> {
//
//			LOGGER.info("Execution Started at : {}", new SimpleDateFormat().format(new Date()));
//
//			String currency = getValueFromParamKey(args, "currency");
//
//			if (currency != null) {
//
////				Request request = getRequest(URL + "/" + currency);
////				Response response = okHttpClient.newCall(request).execute();
////
////				String result = response.body().string();
////
////				LOGGER.info("API Response Status: {}", response.code());
////
////				GsonBuilder gsonBuilder = new GsonBuilder();
////				Gson gson = gsonBuilder.create();
////
////				CurrencyRate rate = gson.fromJson(result, CurrencyRate.class);
////
////				rate.setCheckedAt(LocalDateTime.now());
//
//				//Save to Database
////				CurrencyRate rslt = currencyRateRepository.save(rate);
//				LOGGER.debug("Saved to DB");
//			} else {
////				Request request = getRequest(URL);
////				Response response = okHttpClient.newCall(request).execute();
////
////				String result = response.body().string();
////
////				LOGGER.info("API Response Status: {}", response.code());
////
////				LOGGER.info("API Response: {}", response);
////
////				GsonBuilder gsonBuilder = new GsonBuilder();
////				Gson gson = gsonBuilder.create();
////				CurrencyRate[] rates = gson.fromJson(result, CurrencyRate[].class);
////
////				List<CurrencyRate> currencyRateList = Arrays.asList(rates)
////						.stream()
////						.map(rate -> {
////							rate.setCheckedAt(LocalDateTime.now());
////							return rate;
////						}).collect(Collectors.toList());
//
//				//Save to Database
////				List<CurrencyRate> resultList = currencyRateRepository.saveAll(currencyRateList);
//				LOGGER.debug("Saved to DB");
//			}
//		};
//	}
//
//	private String getValueFromParamKey(ApplicationArguments arguments, String key) {
//		if (arguments.containsOption(key)) {
//			return arguments.getOptionValues(key).get(0);
//		} else {
//			return null;
//		}
//	}
//
//	private Request getRequest(String url) {
//		return new Request.Builder()
//				.url(url)
//				.build();
//	}
//
//}
