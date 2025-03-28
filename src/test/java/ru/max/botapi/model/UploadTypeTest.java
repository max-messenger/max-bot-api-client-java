package ru.max.botapi.model;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ru.max.botapi.UnitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@Category(UnitTest.class)
public class UploadTypeTest {
    @Test
    public void shouldConvertToStringAndBackAgain() {
        assertThat(UploadType.create(UploadType.FILE.getValue()), is(UploadType.FILE));
    }
}