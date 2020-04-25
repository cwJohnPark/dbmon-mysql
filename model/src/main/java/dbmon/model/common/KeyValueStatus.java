package dbmon.model.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class KeyValueStatus {

    @Id @Column(name="variable_name")
    private String variableName;
    @Column(name="variable_value")
    private String variableValue;

    public static <T> T parse(List<KeyValueStatus> list, Class<T> type) {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false)
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .convertValue(toMap(list), type);
    }

    private static Map<String, String> toMap(List<KeyValueStatus> list) {
        return list.stream().collect(
                HashMap::new,
                (m,v) -> m.put(v.getVariableName().toLowerCase(), v.getVariableValue()),
                HashMap::putAll);
    }
}
