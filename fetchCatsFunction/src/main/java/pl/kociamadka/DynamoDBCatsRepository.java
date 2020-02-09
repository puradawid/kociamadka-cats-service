package pl.kociamadka;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DynamoDBCatsRepository implements CatsRepository {
    @Override
    public Cats getAllCats() {
        List<Map<String, AttributeValue>> result = DynamoDbClient.create().scan(ScanRequest.builder().tableName("kociamadkaplCats").build()).items();
        return new Cats(result.stream().map( x -> new Cat(x.get("name").s(), x.get("imageUrl").s())).collect(Collectors.toList()));
    }
}
