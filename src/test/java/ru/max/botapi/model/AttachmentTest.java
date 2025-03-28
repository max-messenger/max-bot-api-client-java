package ru.max.botapi.model;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ru.max.botapi.UnitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@Category(UnitTest.class)
public class AttachmentTest {
    @Test
    public void shouldVisitDefault() {
        Attachment attachment = new Attachment() {
            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override
            public String toString() {
                return "Attachment{}";
            }

        };

        attachment.visit(new FailByDefaultAttachmentVisitor() {
            @Override
            public void visitDefault(Attachment model) {
                assertThat(model, is(attachment));
            }
        });
    }
}