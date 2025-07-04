# Java Fundamentals (With IntelliJ)

> **Note**  
> As of March 2024, this module has been deprecated, and remains here as reference material for previous learners.  
> Current learners can find the equivalent material on the Makers Platform.

_Coaching this? Read the coach guidance
[here.](https://github.com/makersacademy/slug/blob/main/materials/universe/language_intros/challenges/java_fundamentals_with_intellij/HOW_TO_COACH.x.md)_

Java is a very popular language in the software world. It can be used to build 
a lot of different kinds of programs, including desktop, mobile and web 
applications. If you've previously learned a language like Python, Ruby or 
JavaScript, Java is going to feel really different in a number of ways — but 
nothing that you cannot learn!

In this module, you'll first work through some introductory bites, each of 
which focuses on one thing, then you'll be challenged to bring everything 
together in an extended programming exercise.

Very few people will complete all of the materials (and that's fine) but if 
you have any concerns, please reach out to your coach ASAP.

## Learning objectives

In this module you will learn to:

* Use Java's basic syntax.
* Test-drive simple programming problems using Java.
* Test-drive programs in Java using Object Oriented Programming.
* Explain the main differences between Java and languages like Python, Ruby or 
JavaScript.

## Install a Java Development Kit

Java Development Kits (JDK) contain a bunch of tools (including a version of 
Java) that you need for running Java code on your machine. The only thing to be 
aware of here is the version that you're downloading - right now, version 17 
is the best choice (even though there are more recent versions).

Luckily, you can install version 17 using homebrew :)

```shell
; brew install openjdk@17
```

If the installation is successful, you'll see some output messages. One of them
will provide instructions on how to add your Java installation to your `PATH`, 
so that you can use it from the command line. It will look something like this:

```shell
; echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
```

Check the exact text of your message, run the command that it gives you, and 
then restart your terminal so that the changes take effect.

Then, do this to verify that everything worked:

```shell
; java --version
```

And you should see output that's a bit like this:

```shell
openjdk 17.0.5 2022-10-18
OpenJDK Runtime Environment Temurin-17.0.5+8 (build 17.0.5+8)
OpenJDK 64-Bit Server VM Temurin-17.0.5+8 (build 17.0.5+8, mixed mode)
```

>  The most important thing is that you have a version which starts with `17`. Other details might be different and that's fine.
<br>
<details>
  <summary>Why is version 17 better than version 18, 19, etc..?</summary>
  <p>
    There are newer versions than 17, so why not use them? Java versions are a bit unusual in that they are not all intended for long term support (LTS). Some versions are sort of temporary and will stop being updated sooner than others. The table below shows that 17 is the most recent version LTS version.
  </p>
    <table>
      <tr>
        <th>Version</th>
        <th>Release</th>
        <th>End Of Active Support</th>
      </tr>
      <tr>
        <td>21</td>
        <td>19 Sept 2023</td>
        <td>March 2024</td>
      </tr>
      <tr>
        <td>20</td>
        <td>21 March 2023</td>
        <td>19 Sept 2023</td>
      </tr>
      <tr>
        <td>19</td>
        <td>20 Sept 2022</td>
        <td>21 March 2023</td>
      </tr>
      <tr>
        <td>18</td>
        <td>22 March 2022</td>
        <td>19 Sept 2023</td>
      </tr>
      <tr style="background: green">
        <td>17</td>
        <td>14 Sept 2021</td>
        <td>30 Sept 2029</td>
      </tr>
    </table>
</details>
<br>

## IntelliJ Set Up

We will be using the [IntelliJ IDE](https://www.jetbrains.com/idea/) from Jet Brains! 

Head to the [link](https://www.jetbrains.com/idea/download/#section=mac) and download the Community Edition - this is the edition that is free, but is more than capable of handling absolutely everything we need to be able to get going with our Java learning!

Once you have downloaded the `.dmg` file from the website you can drag it into your Applications folder and get started with Phase 1.

## Phase 1 - Java syntax, SpringBoot and JUnit

You'll probably find that you complete the first few bites quickly whilst the last few will take a bit longer. Don't feel that you need to memorise everything before moving on - you can always come back here for a recap. You'll also find that several concepts come up repeatedly as you progress, so there will be opportunities to get further practice.

Some of these challenges include Process Feedback Challenges, in which you share
resources like recordings or files with your coach(es) for feedback. These are
tagged with a :satellite:.

1. [Running Java](bites1_running_java_bite.md)
2. [Writing Java](bites2_writing_java_bite.md)
3. [Static Methods](bites3_static_methods_bite.md)
4. [Instance Methods](bites4_instance_methods_bite.md)
5. [Instance Fields](bites5_instance_fields_bite.md)
6. [Arithmetic](bites6_arithmetic_bite.md)
7. [Strings](bites7_strings_bite.md)
8. [If Statements](bites8_ifs_bite.md) :satellite:
9. [Loops](bites9_loops_bite.md)
10. [Data Structures - Part 1](bites0_data_structures_1_bite.md)
11. [Data Structures - Part 2](bites1_data_structures_2_bite.md)
12. [Interfaces](bites2_interfaces_bite.md)
13. [Test Driven Development](bites3_tdd_bite.md) :satellite:
14. [Spring Boot](bites4_spring_boot_bite.md)

## Phase 2 - Bank

Use the [Bank Challenge](fizzbuzz_and_bank2_bank.md) to consolidate and extend your Java skills.

## Extension Challenges

If you complete all of the above, please reflect on what you'd like to get more practice with and reach out to your coach with that specific request. They'll be able to guide you in the right direction.


<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fjava-fundamentals-with-intellij&prefill_File=README.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fjava-fundamentals-with-intellij&prefill_File=README.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fjava-fundamentals-with-intellij&prefill_File=README.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fjava-fundamentals-with-intellij&prefill_File=README.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fjava-fundamentals-with-intellij&prefill_File=README.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
