package org.osate.result.util;

import org.eclipse.emf.ecore.EObject;
import org.osate.result.AnalysisResult;
import org.osate.result.BooleanValue;
import org.osate.result.Result;
import org.osate.result.Diagnostic;
import org.osate.result.DiagnosticType;
import org.osate.result.IntegerValue;
import org.osate.result.RealValue;
import org.osate.result.ResultFactory;
import org.osate.result.StringValue;

public class ResultUtil {

	public static Diagnostic createError(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.ERROR);
	}

	public static Diagnostic createWarning(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.WARNING);
	}

	public static Diagnostic createInfo(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.INFO);
	}

	public static Diagnostic createSuccess(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.SUCCESS);
	}

	public static Diagnostic createFailure(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.FAILURE);
	}

	public static Diagnostic createNone(String msg, EObject target) {
		return createDiagnostic(msg, target, DiagnosticType.NONE);
	}

	public static Diagnostic createDiagnostic(String msg, EObject target, DiagnosticType rit) {
		Diagnostic issue = ResultFactory.eINSTANCE.createDiagnostic();
		issue.setSourceReference(target);
		issue.setMessage(msg);
		issue.setType(rit);
		return issue;
	}

	public static AnalysisResult createAnalysisResult(String name, EObject target) {
		AnalysisResult result = ResultFactory.eINSTANCE.createAnalysisResult();
		result.setSourceReference(target);
		result.setAnalysis(name);
		return result;
	}

	public static void addIntegerValue(Result contributor, long value) {
		IntegerValue res = ResultFactory.eINSTANCE.createIntegerValue();
		res.setValue(value);
		contributor.getValues().add(res);
	}

	public static void addIntegerValue(Result contributor, long value, String unit) {
		IntegerValue res = ResultFactory.eINSTANCE.createIntegerValue();
		res.setValue(value);
		res.setUnit(unit);
		contributor.getValues().add(res);
	}

	public static void addRealValue(Result contributor, double value) {
		RealValue res = ResultFactory.eINSTANCE.createRealValue();
		res.setValue(value);
		contributor.getValues().add(res);
	}

	public static void addRealValue(Result contributor, double value, String unit) {
		RealValue res = ResultFactory.eINSTANCE.createRealValue();
		res.setValue(value);
		res.setUnit(unit);
		contributor.getValues().add(res);
	}

	public static void addStringValue(Result contributor, String value) {
		StringValue res = ResultFactory.eINSTANCE.createStringValue();
		res.setValue(value);
		contributor.getValues().add(res);
	}

	public static void addBooleanValue(Result contributor, boolean value) {
		BooleanValue res = ResultFactory.eINSTANCE.createBooleanValue();
		res.setValue(value);
		contributor.getValues().add(res);
	}

}
