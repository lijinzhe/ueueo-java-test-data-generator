package com.ueueo.datagenerator.text;

import com.ueueo.datagenerator.core.Generator;
import com.ueueo.datagenerator.core.GeneratorWrapperBase;
import com.ueueo.datagenerator.core.RandomSequenceArrayBasedGenerator;

/**
 * Generates random English words.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class EnglishWordGenerator extends GeneratorWrapperBase<String> implements Generator<String> {
	/**
	 * A list of 1000 of the most common English words.
	 */
	private static final String[] words = new String[] { "about", "after",
			"again", "air", "all", "along", "also", "an", "and", "another",
			"any", "are", "around", "as", "at", "away", "back", "be",
			"because", "been", "before", "below", "between", "both", "but",
			"by", "came", "can", "come", "could", "day", "did", "different",
			"do", "does", "down", "each", "end", "even", "every", "few",
			"find", "first", "for", "found", "from", "get", "give", "go",
			"good", "great", "had", "has", "have", "he", "help", "her", "here",
			"him", "his", "home", "house", "how", "I", "if", "in", "into",
			"is", "it", "its", "just", "know", "large", "last", "left", "like",
			"line", "little", "long", "look", "made", "make", "man", "many",
			"may", "me", "men", "might", "more", "most", "Mr.", "must", "my",
			"name", "never", "new", "next", "no", "not", "now", "number", "of",
			"off", "old", "on", "one", "only", "or", "other", "our", "out",
			"over", "own", "part", "people", "place", "put", "read", "right",
			"said", "same", "saw", "say", "see", "she", "should", "show",
			"small", "so", "some", "something", "sound", "still", "such",
			"take", "tell", "than", "that", "the", "them", "then", "there",
			"these", "they", "thing", "think", "this", "those", "thought",
			"three", "through", "time", "to", "together", "too", "two",
			"under", "up", "us", "use", "very", "want", "water", "way", "we",
			"well", "went", "were", "what", "when", "where", "which", "while",
			"who", "why", "will", "with", "word", "work", "world", "would",
			"write", "year", "you", "your", "was", "able", "above", "across",
			"add", "against", "ago", "almost", "among", "animal", "answer",
			"became", "become", "began", "behind", "being", "better", "black",
			"best", "body", "book", "boy", "brought", "call", "cannot", "car",
			"certain", "change", "children", "city", "close", "cold",
			"country", "course", "cut", "dog", "done", "door", "draw",
			"during", "early", "earth", "eat", "enough", "ever", "example",
			"eye", "face", "family", "far", "father", "feel", "feet", "fire",
			"fish", "five", "food", "form", "four", "front", "gave", "given",
			"got", "green", "ground", "group", "grow", "half", "hand", "hard",
			"heard", "high", "himself", "however", "idea", "important",
			"inside", "John", "keep", "kind", "knew", "known", "land", "later",
			"learn", "let", "letter", "life", "light", "live", "living",
			"making", "mean", "means", "money", "morning", "mother", "move",
			"Mrs.", "near", "night", "nothing", "once", "open", "order",
			"page", "paper", "parts", "perhaps", "picture", "play", "point",
			"ready", "red", "remember", "rest", "room", "run", "school", "sea",
			"second", "seen", "sentence", "several", "short", "shown", "since",
			"six", "slide", "sometime", "soon", "space", "States", "story",
			"sun", "sure", "table", "though", "today", "told", "took", "top",
			"toward", "tree", "try", "turn", "United", "until", "upon",
			"using", "usually", "white", "whole", "wind", "without", "yes",
			"yet", "young", "alone", "already", "although", "am", "America",
			"anything", "area", "ball", "beautiful", "beginning", "Bill",
			"birds", "blue", "boat", "bottom", "box", "bring", "build",
			"building", "built", "care", "carefully", "carried", "carry",
			"center", "check", "class", "coming", "common", "complete", "dark",
			"deep", "distance", "doing", "dry", "easy", "either", "else",
			"everyone", "everything", "fact", "fall", "fast", "felt", "field",
			"finally", "fine", "floor", "follow", "foot", "friend", "full",
			"game", "getting", "girl", "glass", "goes", "gold", "gone",
			"happened", "having", "heart", "heavy", "held", "hold", "horse",
			"hot", "hour", "hundred", "ice", "Indian", "instead", "itself",
			"job", "kept", "language", "lay", "least", "leave", "list",
			"longer", "low", "main", "map", "matter", "mind", "Miss", "moon",
			"mountain", "moving", "music", "needed", "notice", "outside",
			"past", "pattern", "person", "piece", "plant", "poor", "possible",
			"power", "probably", "problem", "question", "quickly", "quite",
			"rain", "ran", "real", "river", "road", "rock", "round", "sat",
			"scientist", "shall", "ship", "simple", "size", "sky", "slowly",
			"snow", "someone", "special", "stand", "start", "state", "stay",
			"stood", "stop", "stopped", "strong", "suddenly", "summer",
			"surface", "system", "taken", "talk", "tall", "ten", "themselves",
			"third", "tiny", "town", "tried", "voice", "walk", "warm", "watch",
			"weather", "whether", "wide", "wild", "winter", "within",
			"writing", "written", "age", "ask", "baby", "base", "beside",
			"bright", "business", "buy", "case", "catch", "caught", "child",
			"choose", "circle", "clear", "color", "copy", "correct",
			"difference", "direction", "dried", "easily", "edge", "egg",
			"eight", "energy", "England", "especially", "Europe", "exactly",
			"except", "explain", "famous", "farm", "fell", "figure", "flat",
			"fly", "forest", "free", "French", "fun", "George", "government",
			"grass", "grew", "hair", "happy", "heat", "history", "human",
			"inch", "information", "iron", "Jim", "Joe", "King", "larger",
			"late", "leg", "length", "listen", "lost", "lot", "lower",
			"machine", "mark", "maybe", "measure", "meet", "middle", "milk",
			"minute", "modern", "moment", "month", "mouth", "natural",
			"nearly", "necessary", "New York", "north", "object", "ocean",
			"oil", "pay", "per", "plan", "plane", "present", "product",
			"rather", "reach", "reason", "record", "running", "seems", "sent",
			"seven", "shape", "sides", "single", "skin", "sleep", "smaller",
			"soft", "soil", "south", "speak", "speed", "spring", "square",
			"star", "step", "store", "straight", "strange", "street",
			"subject", "suppose", "teacher", "thousand", "thus", "Tom",
			"travel", "trip", "trouble", "unit", "village", "wall", "war",
			"week", "whose", "window", "wish", "women", "wood", "wrote",
			"yellow", "yourself", "action", "addition", "afraid", "afternoon",
			"ahead", "amount", "ancient", "anyone", "arm", "bad", "bear",
			"beyond", "bit", "blood", "board", "Bob", "born", "break",
			"British", "broken", "brother", "brown", "busy", "capital", "cat",
			"cattle", "cause", "century", "chance", "clean", "clothes",
			"coast", "control", "cool", "corn", "corner", "cover", "cross",
			"Dan", "dead", "deal", "death", "decide", "difficult", "drive",
			"engine", "evening", "farmer", "faster", "fight", "fill", "finger",
			"force", "forward", "France", "fresh", "garden", "general", "glad",
			"greater", "greatest", "guess", "happen", "Henry", "higher", "hit",
			"hole", "hope", "huge", "interest", "island", "jack", "lady",
			"largest", "lead", "led", "level", "love", "Mary", "material",
			"meant", "meat", "method", "missing", "needs", "nor", "nose",
			"note", "opposite", "pair", "party", "pass", "period", "please",
			"position", "pound", "practice", "pretty", "produce", "pull",
			"quiet", "race", "radio", "region", "result", "return", "rich",
			"ride", "ring", "rule", "sand", "science", "section", "seed",
			"send", "sense", "sets", "sharp", "sight", "sign", "silver",
			"similar", "sit", "son", "song", "spent", "spread", "stick",
			"stone", "tail", "team", "teeth", "temperature", "test",
			"therefore", "thick", "thin", "train", "various", "wait",
			"Washington", "wave", "weight", "west", "wife", "wrong",
			"according", "act", "actually", "Africa", "alike", "apart", "ate",
			"attention", "bank", "basic", "beat", "blow", "bone", "bread",
			"careful", "chair", "chief", "Christmas", "church", "cloth",
			"cloud", "column", "compare", "contain", "continued", "cost",
			"cotton", "count", "dance", "describe", "desert", "dinner",
			"doctor", "dollar", "drop", "dropped", "ear", "east", "electric",
			"element", "enjoy", "equal", "exercise", "experiment", "familiar",
			"farther", "fear", "forth", "gas", "giving", "gray", "grown",
			"hardly", "hat", "hill", "hurt", "imagine", "include", "indeed",
			"Johnny", "joined", "key", "kitchen", "knowledge", "law", "lie",
			"major", "met", "metal", "movement", "nation", "nature", "nine",
			"none", "office", "older", "onto", "original", "paragraph",
			"parent", "particular", "path", "Paul", "Peter", "pick",
			"president", "pressure", "process", "public", "quick", "report",
			"rope", "rose", "row", "safe", "salt", "Sam", "scale", "sell",
			"separate", "sheep", "shoe", "shore", "simply", "sing", "sister",
			"sitting", "sold", "soldier", "solve", "speech", "spend", "steel",
			"string", "student", "studied", "sugar", "television", "term",
			"throughout", "tired", "total", "touch", "trade", "truck", "twice",
			"type", "uncle", "unless", "useful", "value", "verb", "visit",
			"wear", "wheel", "William", "wing", "wire", "won", "wonder",
			"worker", "yard", "alive", "angry", "army", "average", "bag",
			"band", "Billy", "branch", "breakfast", "breath", "broke", "bus",
			"cabin", "California", "camp", "captain", "cell", "cent",
			"certainly", "changing", "closer", "coal", "coat", "community",
			"company", "completely", "compound", "condition", "consider",
			"correctly", "crop", "crowd", "current", "danger", "dear",
			"degree", "develop", "die", "directly", "discover", "divide",
			"double", "dress", "drink", "drove", "dust", "easier", "effect",
			"electricity", "empty", "entire", "everybody", "exciting",
			"expect", "experience", "express", "fair", "feed", "final",
			"finish", "flew", "fruit", "further", "future", "Greek", "guide",
			"gun", "herself", "hungry", "instrument", "Jane" };

	/**
	 * Constructor.
	 */
	public EnglishWordGenerator() {
		super(new RandomSequenceArrayBasedGenerator<String>(words));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.weiming.datagenerator.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return generator.generate();
	}
}
