package com.ueueo.datagenerator.people;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.GeneratorWrapperBase;
import com.ueueo.datagenerator.core.RandomSequenceArrayBasedGenerator;

/**
 * Generates random male names. The list of names was taken from the top 200
 * most common names in the United Stated by the 2000 census.
 *
 * @author Agustin Barto <abarto@gmail.com>
 */
public class EnglishMaleNameGenerator extends GeneratorWrapperBase<String> implements Generator<String> {
    /**
     * The most common male names in the United States.
     */
    private static final String[] names = new String[]{"James", "John",
            "Robert", "Michael", "William", "David", "Richard", "Charles",
            "Joseph", "Thomas", "Christopher", "Daniel", "Paul", "Mark",
            "Donald", "George", "Kenneth", "Steven", "Edward", "Brian",
            "Ronald", "Anthony", "Kevin", "Jason", "Matthew", "Gary",
            "Timothy", "Jose", "Larry", "Jeffrey", "Frank", "Scott", "Eric",
            "Stephen", "Andrew", "Raymond", "Gregory", "Joshua", "Jerry",
            "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas",
            "Henry", "Carl", "Arthur", "Ryan", "Roger", "Joe", "Juan", "Jack",
            "Albert", "Jonathan", "Justin", "Terry", "Gerald", "Keith",
            "Samuel", "Willie", "Ralph", "Lawrence", "Nicholas", "Roy",
            "Benjamin", "Bruce", "Brandon", "Adam", "Harry", "Fred", "Wayne",
            "Billy", "Steve", "Louis", "Jeremy", "Aaron", "Randy", "Howard",
            "Eugene", "Carlos", "Russell", "Bobby", "Victor", "Martin",
            "Ernest", "Phillip", "Todd", "Jesse", "Craig", "Alan", "Shawn",
            "Clarence", "Sean", "Philip", "Chris", "Johnny", "Earl", "Jimmy",
            "Antonio", "Danny", "Bryan", "Tony", "Luis", "Mike", "Stanley",
            "Leonard", "Nathan", "Dale", "Manuel", "Rodney", "Curtis",
            "Norman", "Allen", "Marvin", "Vincent", "Glenn", "Jeffery",
            "Travis", "Jeff", "Chad", "Jacob", "Lee", "Melvin", "Alfred",
            "Kyle", "Francis", "Bradley", "Jesus", "Herbert", "Frederick",
            "Ray", "Joel", "Edwin", "Don", "Eddie", "Ricky", "Troy", "Randall",
            "Barry", "Alexander", "Bernard", "Mario", "Leroy", "Francisco",
            "Marcus", "Micheal", "Theodore", "Clifford", "Miguel", "Oscar",
            "Jay", "Jim", "Tom", "Calvin", "Alex", "Jon", "Ronnie", "Bill",
            "Lloyd", "Tommy", "Leon", "Derek", "Warren", "Darrell", "Jerome",
            "Floyd", "Leo", "Alvin", "Tim", "Wesley", "Gordon", "Dean", "Greg",
            "Jorge", "Dustin", "Pedro", "Derrick", "Dan", "Lewis", "Zachary",
            "Corey", "Herman", "Maurice", "Vernon", "Roberto", "Clyde", "Glen",
            "Hector", "Shane", "Ricardo", "Sam", "Rick", "Lester", "Brent",
            "Ramon", "Charlie", "Tyler", "Gilbert", "Gene", "Marc", "Reginald",
            "Ruben", "Brett", "Angel", "Nathaniel", "Rafael", "Leslie",
            "Edgar", "Milton", "Raul", "Ben", "Chester", "Cecil", "Duane",
            "Franklin", "Andre", "Elmer", "Brad", "Gabriel", "Ron", "Mitchell",
            "Roland", "Arnold", "Harvey", "Jared", "Adrian", "Karl", "Cory",
            "Claude", "Erik", "Darryl", "Jamie", "Neil", "Jessie", "Christian",
            "Javier", "Fernando", "Clinton", "Ted", "Mathew", "Tyrone",
            "Darren", "Lonnie", "Lance", "Cody", "Julio", "Kelly", "Kurt",
            "Allan"};

    /**
     * Constructor.
     */
    public EnglishMaleNameGenerator() {
        super(new RandomSequenceArrayBasedGenerator<String>(names));
    }

    @Override
    public String generate() {
        return generator.generate();
    }
}
