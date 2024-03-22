package com.example.jbehave;

import io.qameta.allure.jbehave5.AllureJbehave5;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnit4StoryRunner;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import com.example.jbehave.steps.GameSteps;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4StoryRunner.class)
public class JBehaveTest extends JUnitStories {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withReporters(new AllureJbehave5())
                );
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        // add here tests scenarios java files
        return new InstanceStepsFactory(configuration(),
                new GameSteps()
        );
    }

    @Override
    public List<String> storyPaths() {
        return Arrays.asList(
                "stories/game.story"
        );
    }
}
