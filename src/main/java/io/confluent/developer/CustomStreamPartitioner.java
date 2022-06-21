package io.confluent.developer;

import org.apache.kafka.streams.processor.StreamPartitioner;

//Custom partitioning logic. Just an example that will return value between 0-7 hence applies for 8 paritions
public class CustomStreamPartitioner implements StreamPartitioner<String, String> {

	public static final int alphabetSize = 26;

	@Override
	public Integer partition(String topic, String key, String value, int numPartitions) {
		// TODO Auto-generated method stub
		return getAlphabetPosition(value) % alphabetSize;
	}

	public Integer getAlphabetPosition(String input) {
		int position = 0;
		input = input.toLowerCase();
		position = input.charAt(0) - 'a';
		return position;
	}
}
