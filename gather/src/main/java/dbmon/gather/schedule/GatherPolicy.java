package dbmon.gather.schedule;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

@Data
@RequiredArgsConstructor
public class GatherPolicy {
    private final TemporalUnit timeUnit;
    private final int rate;
}
