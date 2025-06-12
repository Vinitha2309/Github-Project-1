# Github-Project-1.

🧓 Elderly Care Companion Bot (Java Project)

🧠 Project Objective

Build a Java-based chatbot that acts as a  virtual companion for elderly users. It provides:

Daily medication and appointment reminders

Conversational support to reduce loneliness

Emergency monitoring (e.g., if there's no response)

Caregiver notification system

Optional voice interface for hands-free use

🔑 Features

1. ✅ Medication & Task Reminder

GUI or voice notifications for:

Medicine schedules

Doctor appointments

Hydration reminders


Java Timer / ScheduledExecutorService for scheduling

Uses SQLite to store recurring tasks and times

2. 💬 Conversation Module

Basic chat functionality:

Greetings

Mood checking

Simple small talk


NLP Options:

Basic: Rule-based patterns using regex or keyword match

Advanced: Connect to OpenAI API or use Rasa NLU


Can integrate Text-to-Speech (TTS) using:

FreeTTS (Java)

Or external services like Google Cloud TTS

3. 🚨 Emergency Detection

Detect if user hasn’t interacted in a while

Optional panic button in UI

Sends alert to caregiver via:

Email (JavaMail API)

SMS (Twilio API)

MQTT (if integrated with IoT wearables)

4. 📱 Optional: Voice Interface

Speech-to-Text (STT) with:

CMU Sphinx (offline, open-source)

Google Speech-to-Text API (better accuracy)


TTS for replying

5. 🧾 Daily Report to Caregiver

Summary of:

Medications taken/missed

Interaction logs

Any alerts triggered


Auto-generate report as PDF (using Apache PDFBox) or email

🖥️ UI Design (JavaFX)

Large buttons, simple layout

Color-coded:

Green = All OK

Yellow = Reminder Pending

Red = Alert Triggered


Components:

“How are you feeling today?” input

“Reminders” panel

“Talk to Me” button

“Alert Caregiver” button

🔐 Security & Privacy

Encrypt stored personal data (AES or simple obfuscation)

Consent screen for storing personal info

Rate-limit messages to avoid spam

🧪 Future Extensions

Integrate with IoT fall detection devices

Use camera + pose detection for inactivity monitoring

Learn preferences over time
1. Set up your environment:

Unzip JavaFX SDK and export it in the classpath.

Download the SQLite JDBC .jar file: sqlite-jdbc



2. Compile the Code:

javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls \
  -cp .:sqlite-jdbc-3.42.0.0.jar *.java


3. Run the App:

java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls \
  -cp .:sqlite-jdbc-3.42.0.0.jar Main





