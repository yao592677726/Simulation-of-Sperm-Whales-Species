# Simulation-of-Sperm-Whales-Species

## Initial goal
The initial goal is to realize one season. If the process is advance, we can try ten years.

## Class
Main Process, Chengxi Yao

Killer Whales, Zeyu CHen

Sperm Whales, Taoyouwei Gao

Marine Mammals, Weihua Zhu

The mechanism is:
Every thread schedule its own events. Because we are using threads, we DO NOT using communication. Each thread can 
directly call the specific object function to modify the value. The shared value must be protected by the lock.

The examples are marine mammals and sperm whales consume food. The function handle this is in Main Process since food
resource is maintained by main process.

The first step is to construct the functions in each class.

Then construct the thread function in the main after engine class is constructed. You can use main function to test if 
functions in your process works.

The event engine class is under constructed.(Yes)

