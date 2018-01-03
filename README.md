# JSP_Iteration_using_Custom_Tag
We can iterate the body content of any tag using the doAfterBody() method of IterationTag interface.  Here we are going to use the TagSupport class which implements the IterationTag interface. For iterating the body content, we need to use the EVAL_BODY_AGAIN constant in the doAfterBody() method.
